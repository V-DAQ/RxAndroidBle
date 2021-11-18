package com.polidea.rxandroidble.internal.operations;

import android.bluetooth.BluetoothGatt;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.polidea.rxandroidble.exceptions.BleGattOperationType;
import com.polidea.rxandroidble.internal.SingleResponseOperation;
import com.polidea.rxandroidble.internal.connection.RxBleGattCallback;

import bleshadow.javax.inject.Inject;

import rx.Observable;

@RequiresApi(api = Build.VERSION_CODES.O)
public class SetPreferredPhyOperation extends SingleResponseOperation<Integer> {

    private final int txPhy;
    private final int rxPhy;
    private final int phyOptions;

    @Inject
    SetPreferredPhyOperation(
            RxBleGattCallback rxBleGattCallback,
            BluetoothGatt bluetoothGatt,
            TimeoutConfiguration timeoutConfiguration,
            int requestedTxPhy,
            int requestedRxPhy,
            int requestedphyOptions) {
        super(bluetoothGatt, rxBleGattCallback, BleGattOperationType.ON_PHY_UPDATE, timeoutConfiguration);
        txPhy = requestedTxPhy;
        rxPhy = requestedRxPhy;
        phyOptions = requestedphyOptions;
    }

    @Override
    protected Observable<Integer> getCallback(RxBleGattCallback rxBleGattCallback) {
        return rxBleGattCallback.getOnPhyUpdate();
    }

    @Override
    protected boolean startOperation(BluetoothGatt bluetoothGatt) {
        bluetoothGatt.setPreferredPhy(txPhy, rxPhy, phyOptions);
        return true;
    }
}
