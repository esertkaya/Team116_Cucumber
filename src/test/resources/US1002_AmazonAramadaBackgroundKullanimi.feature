Feature: US1002 Kullanici background kullanarak amazonda istedigi aramalari yapar
  #senaryolardaki ortak baslangic adimlari icin kullanilir

  Background:
    Given kullanici amazon anasayfaya gider

  Scenario: TC04 Kullanici amazonda Nutella arayabilmeli
    Then arama kutusuna Nutella yazip ENTER tusuna basar
    And arama sonuclari'nin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 Kullanici amazonda Samsun aratabilmeli
    Then arama kutusuna Samsung yazip ENTER tusuna basar
    And arama sonuclari'nin Samsung icerdigini test eder
    And sayfayi kapatir

  Scenario: TC06 Kullanici amazonda java aratabilmeli
    Then arama kutusuna Java yazip ENTER tusuna basar
    And arama sonuclari'nin Java icerdigini test eder
    And sayfayi kapatir