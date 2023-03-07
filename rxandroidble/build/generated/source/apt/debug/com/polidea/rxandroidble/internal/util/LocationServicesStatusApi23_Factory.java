// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble.internal.util;

import bleshadow.dagger.internal.Factory;
import bleshadow.javax.inject.Provider;

public final class LocationServicesStatusApi23_Factory
    implements Factory<LocationServicesStatusApi23> {
  private final Provider<CheckerLocationProvider> checkerLocationProvider;

  private final Provider<CheckerLocationPermission> checkerLocationPermissionProvider;

  private final Provider<Integer> targetSdkProvider;

  private final Provider<Boolean> isAndroidWearProvider;

  public LocationServicesStatusApi23_Factory(
      Provider<CheckerLocationProvider> checkerLocationProvider,
      Provider<CheckerLocationPermission> checkerLocationPermissionProvider,
      Provider<Integer> targetSdkProvider,
      Provider<Boolean> isAndroidWearProvider) {
    this.checkerLocationProvider = checkerLocationProvider;
    this.checkerLocationPermissionProvider = checkerLocationPermissionProvider;
    this.targetSdkProvider = targetSdkProvider;
    this.isAndroidWearProvider = isAndroidWearProvider;
  }

  @Override
  public LocationServicesStatusApi23 get() {
    return new LocationServicesStatusApi23(
        checkerLocationProvider.get(),
        checkerLocationPermissionProvider.get(),
        targetSdkProvider.get(),
        isAndroidWearProvider.get());
  }

  public static LocationServicesStatusApi23_Factory create(
      Provider<CheckerLocationProvider> checkerLocationProvider,
      Provider<CheckerLocationPermission> checkerLocationPermissionProvider,
      Provider<Integer> targetSdkProvider,
      Provider<Boolean> isAndroidWearProvider) {
    return new LocationServicesStatusApi23_Factory(
        checkerLocationProvider,
        checkerLocationPermissionProvider,
        targetSdkProvider,
        isAndroidWearProvider);
  }

  public static LocationServicesStatusApi23 newLocationServicesStatusApi23(
      CheckerLocationProvider checkerLocationProvider,
      CheckerLocationPermission checkerLocationPermission,
      int targetSdk,
      boolean isAndroidWear) {
    return new LocationServicesStatusApi23(
        checkerLocationProvider, checkerLocationPermission, targetSdk, isAndroidWear);
  }
}
