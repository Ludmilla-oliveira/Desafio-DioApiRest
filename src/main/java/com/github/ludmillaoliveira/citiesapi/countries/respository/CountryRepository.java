package com.github.ludmillaoliveira.citiesapi.countries.respository;

import com.github.ludmillaoliveira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CountryRepository extends JpaRepository <Country, Long>  {


}
