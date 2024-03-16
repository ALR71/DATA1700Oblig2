# DATA1700Oblig2
## Info om utgiver
* OsloMet Brukernavn: alalr7105@oslomet.no
* GitHub Brukernavn: ALR71
* GitHub Repo URL: https://github.com/ALR71/DATA1700Oblig2
* Navn: Ali Al-Rubaye
## Info om prosjektet
* Beskrivelse av applikasjon:
  Applikasjonen er har klient/tjener sider og mest av validering skjer på HTML med pattern på klient,
  og alle feltene må fylles ut (Required).
* Alle verdier blir fjernet når billetter legges inn, så brukeren kan enkelt legge inn nye billetter.
* Alt av valideringen er tilpasset for hvert felt og har enkelt forklaring eller eksempel i placeholder til HTML,
  slik at man kan forstå det enkelt.
* Feil meldinger blir håndert automatisk av innebygd funksjoner gjennom form, og form submit gir ikke "refresh"
  på nettsiden, for at data blir ikke borte.
* Tabellen legger ut alt i table format gjennom javascript som henter in data fra billetcontroller.java
  og hver gang nytt data legges inn,går dette gjennom formaterings funksjonen som er kalt for "formaterdata()",
  deretter slettes alt det forrige i HTML, slik at alt data får "refresh", og slett alle billetter knappen utgjør
  sletting via javascript med en post metode.
* Har brukt en miks mellom JQuery og vanilla JavaScript, for JQuery er noe nytt for meg.
  Billett.java har sin egen konstruktør, get og set for private variabler for objektet "Billett".
  BillettController har inn alt av Post og Get, som blir håndtert av spring boot framework.