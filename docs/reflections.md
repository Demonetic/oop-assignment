# Reflektioner

### Saker som gått bra
Hela uppgiften har varit ganska kämpigt då det är mitt första "stora" projekt. Däremot har en
<br>del saker gått relativt smärtfritt som bland annat skapandet av min meny och mina första
<br>getters och setters. Menyn klarade av att ta in user-input och gick tillbaka till huvudmenyn
<br>efter varje äventyr på första försöket utan att jag behövde göra om något i den funktionen.

En annan sak som gick bra var själva planeringen. Jag skrev ner alla mina idéer i ett
<br>anteckningsblock och skissade upp hur jag ville att hierarkin skulle se ut. Jag tog även tiden
<br>att skriva ner vilka metoder och attribut jag ville ha vart några dagar innan jag faktiskt började
<br>koda vilket gjorde att skapandet av alla klass-skelett gick väldigt smidigt.

### Saker som varit utmanande
Det jag kämpat allra mest med är att förstå mig på hur alla åtkomstmodifierare fungerar.
<br>De "vanligare" attributen som *Name* var ju enkelt att göra en getter för men andra privata
<br>attribut eller metoder har varit svårare att hitta sätt att få åtkomst till.

Till exempel hade jag svårt att lösa hur jag skulle kunna använda mitt *Weapon* i *Game*
<br>logiken eftersom jag hade instansierat mitt *Weapon* i *Hero* klassen och skötte användningen 
<br>därifrån. Det löste sig till slut genom att jag skapade en getter *getWeapon* i *Hero* som gjorde 
<br>att jag kunde få tillgång till hjältens anvädning av vapnets attribut i andra klasser.

Ett annat problem jag hade var att jag inte skrev ut min sista print-sats i *status()* efter att
<br>någon dog i combat. Efter mycket förvirring hittade jag att jag hade råkat sätta min if-sats
<br>som kontrollerade vad jag skrev ut när någon dog låg inne i while-loopen. Problemet löstes
<br>av att jag bara flyttade den utanför while-loopen. Jag hade många sådana småfel där jag
<br>helt enkelt hade stoppat in saker i fel måsvingar utan att det var supertydligt.

### Inlärda koncept
Efter att ha skapat mitt projekt har jag fått en mycket bättre förståelse för arv i Java. Det blev
<br>tydligt hur hierarkin är uppbyggt när man faktiskt skapade sina egna klasser och var tvungen
<br>att fundera på vilka attribut som skulle ärvas och vilka attribut subklasserna själva skulle ha.

Jag har även lärt mig att man enkelt kan kalla på andra funktioner från andra klasser, till
<br>exempel när jag kallar på mina funktioner i min switch-case till menyn. Min första tanke var
<br>att jag skulle stoppa in all min game-logik med while-loopar och if-satser direkt i min switch-case.
<br>Det hade dock gjort koden väldigt svår att läsa vilket jag är glad att jag kunde undvika.