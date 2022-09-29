package com.bitget.openapi.dto.request.other;

import java.util.*;

public class OrderBookDiffer {

    /*public <T extends OrderBookItem> List<T> diff(List<T> current, List<T> snapshot,
        final Comparator<BigDecimal> comparator, Function<BigDecimal, T> emptyItemFunction) {
        final Iterator<T> snapshotIter = snapshot.iterator();
        final Iterator<T> currentIter = current.iterator();
        final List<T> diff = new ArrayList<>(current.size());
        if (snapshotIter.hasNext() && currentIter.hasNext()) {
            T snapshotBookItem = snapshotIter.next();
            T currentBookItem = currentIter.next();
            for (;;) {
                final int compare = comparator.compare(snapshotBookItem.getPrice(), currentBookItem.getPrice());
                if (compare == 0) {
                    if (!snapshotBookItem.equals(currentBookItem)) {
                        diff.add(currentBookItem);
                    }
                    if (currentIter.hasNext() && snapshotIter.hasNext()) {
                        currentBookItem = currentIter.next();
                        snapshotBookItem = snapshotIter.next();
                    } else {
                        break;
                    }
                } else if (compare < 0) {
                    diff.add(emptyItemFunction.apply(snapshotBookItem.getPrice()));
                    if (snapshotIter.hasNext()) {
                        snapshotBookItem = snapshotIter.next();
                    } else {
                        diff.add(currentBookItem);
                        break;
                    }
                } else {
                    diff.add(currentBookItem);
                    if (currentIter.hasNext()) {
                        currentBookItem = currentIter.next();
                    } else {
                        diff.add(emptyItemFunction.apply(snapshotBookItem.getPrice()));
                        break;
                    }
                }
            }
        }

        if (!snapshotIter.hasNext()) {
            currentIter.forEachRemaining(diff::add);
        }
        if (!currentIter.hasNext()) {
            snapshotIter.forEachRemaining(remain -> diff.add(emptyItemFunction.apply(remain.getPrice())));
        }
        return Collections.unmodifiableList(diff);

    }*/

    public <T extends OrderBookItem> List<T> diff(List<T> current, List<T> snapshot,
                                                  final Comparator<String> comparator) {
        //Incremental array
        final Iterator<T> snapshotIter = snapshot.iterator();
        //Full amount of data available
        final Iterator<T> currentIter = current.iterator();
        final List<T> diff = new ArrayList<>(current.size());
        if (snapshotIter.hasNext() && currentIter.hasNext()) {
            T snapshotBookItem = snapshotIter.next();
            T currentBookItem = currentIter.next();
            /*System.out.println("snapshotBookItem===================="+snapshotBookItem);
            System.out.println("currentBookItem======================="+currentBookItem);
            System.out.println("snapshotBookItem.getPrice()===================="+snapshotBookItem.getPrice());
            System.out.println("currentBookItem.getPrice()======================="+currentBookItem.getPrice());*/


            for (; ; ) {
                final int compare = comparator.compare(snapshotBookItem.getPrice(), currentBookItem.getPrice());
                //final int compare = comparator.compare(spotOrderBookItems[0], currentBookItems[0]);
                //When prices are equal
                if (compare == 0) {
                    if (!snapshotBookItem.equals(currentBookItem)) {
                        if (!"0".equals(snapshotBookItem.getSize().toString())) {
                            diff.add(snapshotBookItem);
                        }
                    }
                    if (currentIter.hasNext() && snapshotIter.hasNext()) {
                        currentBookItem = currentIter.next();
                        snapshotBookItem = snapshotIter.next();
                    } else {
                        break;
                    }
                    //The incremental price is less than the full quantity
                } else if (compare < 0) {
                    if (!"0".equals(snapshotBookItem.getSize().toString())) {
                        diff.add(snapshotBookItem);
                    }
                    if (snapshotIter.hasNext()) {
                        snapshotBookItem = snapshotIter.next();
                    } else {
                        diff.add(currentBookItem);
                        break;
                    }
                } else {
                    diff.add(currentBookItem);
                    if (currentIter.hasNext()) {
                        currentBookItem = currentIter.next();
                    } else {
                        if (!"0".equals(snapshotBookItem.getSize().toString())) {
                            diff.add(snapshotBookItem);
                        }
                        break;
                    }
                }
            }
        }

        if (!snapshotIter.hasNext()) {
            currentIter.forEachRemaining(diff::add);
        }
        if (!currentIter.hasNext()) {
//            snapshotIter.forEachRemaining(remain -> diff.add(emptyItemFunction.apply(remain.getPrice())));
            snapshotIter.forEachRemaining(diff::add);
        }
        //Return the non modifiable diff
        return Collections.unmodifiableList(diff);

    }
}
