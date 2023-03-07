// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble.internal.scan;

import bleshadow.dagger.internal.Factory;
import bleshadow.javax.inject.Provider;
import rx.Scheduler;

public final class ScanPreconditionsVerifierApi24_Factory
    implements Factory<ScanPreconditionsVerifierApi24> {
  private final Provider<ScanPreconditionsVerifierApi18> scanPreconditionVerifierApi18Provider;

  private final Provider<Scheduler> timeSchedulerProvider;

  public ScanPreconditionsVerifierApi24_Factory(
      Provider<ScanPreconditionsVerifierApi18> scanPreconditionVerifierApi18Provider,
      Provider<Scheduler> timeSchedulerProvider) {
    this.scanPreconditionVerifierApi18Provider = scanPreconditionVerifierApi18Provider;
    this.timeSchedulerProvider = timeSchedulerProvider;
  }

  @Override
  public ScanPreconditionsVerifierApi24 get() {
    return new ScanPreconditionsVerifierApi24(
        scanPreconditionVerifierApi18Provider.get(), timeSchedulerProvider.get());
  }

  public static ScanPreconditionsVerifierApi24_Factory create(
      Provider<ScanPreconditionsVerifierApi18> scanPreconditionVerifierApi18Provider,
      Provider<Scheduler> timeSchedulerProvider) {
    return new ScanPreconditionsVerifierApi24_Factory(
        scanPreconditionVerifierApi18Provider, timeSchedulerProvider);
  }
}
