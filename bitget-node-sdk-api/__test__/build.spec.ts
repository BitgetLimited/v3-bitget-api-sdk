// tslint:disable-next-line:no-var-requires
const {MixAccountApi} = require('@bitget/bitget-node');
import { test, describe, expect } from '@jest/globals'
import * as Console from 'console';


describe('test after build', () => {
  const api = new MixAccountApi();

  const symbol = 'cmt_btcusdt'

  test('accounts', () => {
    return api.accounts('umcbl').then(() => {
      Console.log();
    })
  })
})
