package com.alexandria.managers;

import com.alexandria.entities.ClientEntity;
import com.alexandria.entities.CountryEntity;
import com.alexandria.entities.TitleEntity;

import java.util.List;

public interface ClientManager {

    void register(ClientEntity client);

    ClientEntity validateClient(Login login);

    List<TitleEntity> getTitlesList();

    List<CountryEntity> getCountriesList();
}
