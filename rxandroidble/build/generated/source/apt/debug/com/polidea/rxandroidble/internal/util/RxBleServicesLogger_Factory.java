// Generated by Dagger (https://google.github.io/dagger).
package com.polidea.rxandroidble.internal.util;

import bleshadow.dagger.internal.Factory;
import bleshadow.javax.inject.Provider;

public final class RxBleServicesLogger_Factory implements Factory<RxBleServicesLogger> {
  private final Provider<CharacteristicPropertiesParser> characteristicPropertiesParserProvider;

  public RxBleServicesLogger_Factory(
      Provider<CharacteristicPropertiesParser> characteristicPropertiesParserProvider) {
    this.characteristicPropertiesParserProvider = characteristicPropertiesParserProvider;
  }

  @Override
  public RxBleServicesLogger get() {
    return new RxBleServicesLogger(characteristicPropertiesParserProvider.get());
  }

  public static RxBleServicesLogger_Factory create(
      Provider<CharacteristicPropertiesParser> characteristicPropertiesParserProvider) {
    return new RxBleServicesLogger_Factory(characteristicPropertiesParserProvider);
  }

  public static RxBleServicesLogger newRxBleServicesLogger(
      CharacteristicPropertiesParser characteristicPropertiesParser) {
    return new RxBleServicesLogger(characteristicPropertiesParser);
  }
}
