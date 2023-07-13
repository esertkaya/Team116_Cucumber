
Feature: Nutella arama testi

  Scenario: TC01 Kullanici amazonda Nutella arayabilmeli

    Given kullanici amazon anasayfaya gider
    Then arama kutusuna Nutella yazip ENTER tusuna basar
    And arama sonuclari'nin Nutella icerdigini test eder
    And sayfayi kapatir


    Scenario: TC02 Kullanici amazonda Samsun aratabilmeli
      Given kullanici amazon anasayfaya gider
      Then arama kutusuna Samsung yazip ENTER tusuna basar
      And arama sonuclari'nin Samsung icerdigini test eder
      And sayfayi kapatir

      Scenario: TC03 Kullanici amazonda java aratabilmeli
        Given kullanici amazon anasayfaya gider
        Then arama kutusuna Java yazip ENTER tusuna basar
        And arama sonuclari'nin Java icerdigini test eder
        And sayfayi kapatir





