import {compact} from 'typedoc/dist/lib/output/helpers/compact';
import Console from 'console';
import crc32 from 'crc-32';

export class BookInfo {
    private _asks!: any[][];
    private _bids!: any[][];
    private _checksum!: string;
    private _ts!: string;


    constructor(asks: [][], bids: [][], checksum: string, ts: string) {
        this._asks = asks;
        this._bids = bids;
        this._checksum = checksum;
        this._ts = ts;
    }


    get asks(): any[][] {
        return this._asks;
    }

    set asks(value: any[][]) {
        this._asks = value;
    }

    get bids(): any[][] {
        return this._bids;
    }

    set bids(value: any[][]) {
        this._bids = value;
    }

    get checksum(): string {
        return this._checksum;
    }

    set checksum(value: string) {
        this._checksum = value;
    }

    get ts(): string {
        return this._ts;
    }

    set ts(value: string) {
        this._ts = value;
    }

    merge(bookInfo: BookInfo): BookInfo {

        // @ts-ignore
        this._asks = this.innerMerge(this.asks, bookInfo.asks, false);
        // Console.info(this.asks);
        // @ts-ignore
        this._bids = this.innerMerge(this.bids, bookInfo.bids, true);
        // Console.info(this.bids);
        return this;
    }

    private innerMerge(allList: any[][], updateList: any[][], isReverse: boolean): any[][] {
        const priceAndValue = new Map();
        const result = new Array<any[]>();
        allList.forEach((val, idx, array) => {
            priceAndValue.set(val[0], val);
        });
        // tslint:disable-next-line:forin
        for (const val in updateList) {
            if (updateList[val][1] === '0') {
                priceAndValue.delete(updateList[val][0]);
                continue;
            }
            priceAndValue.set(updateList[val][0], updateList[val]);
        }
        for (const value of priceAndValue.values()) {
            result.push(value);
        }
        if (isReverse) {
            result.sort((a, b) => parseFloat(b[0]) - parseFloat(a[0]));
        } else {
            result.sort((a, b) => parseFloat(a[0]) - parseFloat(b[0]));
        }
        return result;
    }

    checkSum(checkSum: number): boolean {
        let result = '';
        for (let i = 0; i < 25; i++) {
            if (this._bids[i]) {
                result = result + this._bids[i][0] + ':' + this._bids[i][1] + ':';
            }
            if (this._asks[i]) {
                result = result + this._asks[i][0] + ':' + this._asks[i][1] + ':';
            }
        }
        result = result.substr(0, result.length - 1);

        const newCheckSum = crc32.str(result);

        Console.info('mergeVal:' + this.getSignedInt(newCheckSum) + ',checkSum:' + checkSum);
        return checkSum === this.getSignedInt(newCheckSum);
    }

    getSignedInt(checksum: number) {
        const intMax = (2 ** 31) - 1;
        if (checksum > intMax) {
            return checksum - intMax * 2 - 2;
        }
        return checksum;
    }
}