package com.example.compu.capyfinder;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActSearch extends AppCompatActivity {

    RecyclerView listshowrcy;
    List<Item> productlists=new ArrayList<>();
    MainActivityAdapter adapter;
    SearchView searchView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_search);


        /*
        * INICIO INSERTAR INFORMACION
        * */
        productlists.add(new Item("Afganistan","Kabul","Afgano/a",R.drawable.afghanistan,"Afghanistan","Kabul","Afghan"));
        productlists.add(new Item("Albania","Tirana","Albanes",R.drawable.albania,"Albania","Tirane","Albanian"));
        productlists.add(new Item("Argelia","Argel","Argelino/a",R.drawable.algeria,"Algeria","Argiers","Algerian"));
        productlists.add(new Item("Andorra","Andorra La Vieja","Andorrano",R.drawable.andorra,"Andorra","Andorra La Vella","Andorran"));
        productlists.add(new Item("Angola","Luanda","Angoleño/a",R.drawable.angola,"Angola","Luanda","Angolan"));
        productlists.add(new Item("Argentina","Buenos Aires","Argentino/a",R.drawable.argentina,"Argentina","Buenos Aires","Argentinian"));
        productlists.add(new Item("Armenia","Erevan","Armenio",R.drawable.armenia,"Armenia","Yerevan","Armenian"));
        productlists.add(new Item("Australia","Canberra","Australiano/a",R.drawable.australia,"Australia","Canberra","Australian, Aussie"));
        productlists.add(new Item("Austria","Viena","Austriaco/a",R.drawable.austria,"Austria","Vienna","Austrian"));
        productlists.add(new Item("Azerbaiyan","Baku","Azeri, Azerbaiyano/a",R.drawable.azerbaijan,"Azerbaijan","Baku","Azerbaijani"));
        productlists.add(new Item("Bahamas","Nassau","Bahames, Bahameño",R.drawable.bahamas,"Bahamas","Nassau","Bahaman"));
        productlists.add(new Item("Barbados","Bridgetown","Barbandense",R.drawable.barbados,"Barbados","Bridgetown","Barbadian"));
        productlists.add(new Item("Bielorrusia","Minsk","Bielorruso/a",R.drawable.belarus,"Belarus","Minsk","Belarusian"));
        productlists.add(new Item("Belgica","Bruselas","Belga",R.drawable.belgium,"Belgium","Brussels","Belgian"));
        productlists.add(new Item("Belice","Belmopan","Beliceño/a",R.drawable.belize,"Belize","Belmopan","Belizean"));
        productlists.add(new Item("Benin","Porto-Novo","Benines",R.drawable.benin,"Benin","Porto-Novo","Beninese"));
        productlists.add(new Item("Butan","Timbu","Butanes/a",R.drawable.bhutan,"Bhutan","Thimphu","Bhutian"));
        productlists.add(new Item("Bolivia","Sucre, La Paz","Boliviano/a",R.drawable.bolivia,"Bolivia","Sucre (La Paz)","Bolivian"));
        productlists.add(new Item("Bosnia Y Herzegovina","Sarajevo","Bosnio",R.drawable.bosniaandherzegovina,"Bosnia- Herzegovina","Sarajevo","Bosnian"));
        productlists.add(new Item("Botswana","Gaborone","Botswanes",R.drawable.botswana,"Botswana","Gaborone","Tswana"));
        productlists.add(new Item("Brasil","Brasilia","Brasileño/a, Brasilero/a",R.drawable.brazil,"Brazil","Brasilia","Brazilian"));
        productlists.add(new Item("Brunei","Bandar Seri Begawan","Bruneano/a",R.drawable.brunei,"Brunei (Darussalam)","Bandar Seri Begawan","Bruneian"));
        productlists.add(new Item("Bulgaria","Sofia","Bulgaro/a",R.drawable.bulgaria,"Bulgaria","Sofia","Bulgarian"));
        productlists.add(new Item("Burkina Faso","Uagadugu","Burkines",R.drawable.burkinafaso,"Burkina Faso","Ouagadougou","Burkinan"));
        productlists.add(new Item("Burundi","Buyumbura","Burundiano/a",R.drawable.burundi,"Burundi","Bujumbara","Burundian"));
        productlists.add(new Item("Camboya","Pnon Pehn","Camboyano/a",R.drawable.cambodia,"Cambodia","Phnom- Pehn","Cambodian"));
        productlists.add(new Item("Camerun","Yaunde","Camerunes, Camerunense",R.drawable.cameroon,"Cameroon","Yaounde","Cameroonian"));
        productlists.add(new Item("Canada","Ottawa","Canadiense",R.drawable.canada,"Canada","Ottawa","Canadian"));
        productlists.add(new Item("Cabo Verde","Praia","Caboverdiano",R.drawable.capeverde,"Cape Verde","Praia","Cape Verdian"));
        productlists.add(new Item("Republica Centroafricana","Bangui","Centroafricano/a",R.drawable.centralafricanrepublic,"Central African Republic","Bangui","Centralafrican"));
        productlists.add(new Item("Chad","Yamena","Chadiano/a",R.drawable.chad,"Chad","N'djamena","Chadian"));
                productlists.add(new Item("Chile","Santiago De Chile","Chileno/a",R.drawable.chile,"Chile","Santiago","Chilean"));
        productlists.add(new Item("China","Pekin","Chino/a",R.drawable.china,"China","Beijing","Chinese"));
        productlists.add(new Item("Colombia","Bogota","Colombiano/a",R.drawable.colombia,"Colombia","Bogota","Colombian"));
        productlists.add(new Item("Comoras","Moroni","Comorano/a, Comorense",R.drawable.comoros,"Comoros","Moroni","Comorian"));
        productlists.add(new Item("Republica Del Congo","Brazzaville","Congoles, Congoleño",R.drawable.republicofthecongo,"Congo","Brazzaville","Congolese"));
        productlists.add(new Item("Costa Rica","San Jose","Costarricense",R.drawable.costarica,"Costa Rica","San Jose","Costa Rican"));
        productlists.add(new Item("Croacia","Zagreb","Croata",R.drawable.croatia,"Croatia","Zagreb","Croat"));
        productlists.add(new Item("Cuba","La Habana","Cubano/a",R.drawable.cuba,"Cuba","Havana","Cuban"));
        productlists.add(new Item("Republica Checa","Praga","Checo/a",R.drawable.czechrepublic,"Czech Republic","Prague","Czech"));
        productlists.add(new Item("Republica Democratica Del Congo","Kinshasa","Zaireño/a",R.drawable.democraticrepublicofcongo,"Democratic Republic Of Congo","Kinshasa","Zairian"));
        productlists.add(new Item("Dinamarca","Copenhague","Danes/ Danesa",R.drawable.denmark,"Denmark","Copenhagen","Dane"));
        productlists.add(new Item("Yibuti","Yibuti","Yibutiano/a",R.drawable.djibouti,"Djibouti","Djibouti","Djiboutian"));
        productlists.add(new Item("Republica Dominicana","Santo Domingo","Dominicano/a",R.drawable.dominicanrepublic,"Dominican Republic","Santo Domingo","Dominican"));
        productlists.add(new Item("Ecuador","Quito","Ecuatoriano/a",R.drawable.ecuador,"Ecuador","Quito","Ecuadorian, Ecuadoran"));
        productlists.add(new Item("Egipto","El Cairo","Egipcio/a",R.drawable.egypt,"Egypt","Cairo","Egyptian"));
        productlists.add(new Item("El Salvador","San Salvador","Salvadoreño/a",R.drawable.elsalvador,"El Salvador","San Salvador","Salvadorian, Salvadoran"));
        productlists.add(new Item("Inglatera","Londres","Ingles/ Inglesa",R.drawable.england,"England","London","Englishman"));
        productlists.add(new Item("Guinea Ecuatorial","Malabo","Ecuatoguineano/a",R.drawable.equatorialguinea,"Equatorial Guinea","Malabo","Guinean"));
        productlists.add(new Item("Eritrea","Asmara","Sin Info",R.drawable.eritrea,"Eritrea","Asmara","Sin Info"));
        productlists.add(new Item("Estonia","Tallin","Estonio",R.drawable.estonia,"Estonia","Tallinn","Estonian"));
        productlists.add(new Item("Etiopia","Adis Abeba","Etiope",R.drawable.ethiopia,"Ethiopia","Addis Abeba","Ethiopian"));
        productlists.add(new Item("Fiyi","Suva","Fiyiano/a",R.drawable.fiji,"Fiji","Suva","Fijian"));
        productlists.add(new Item("Finlandia","Helsinki","Finlandes/ Finlandesa; Fines",R.drawable.finland,"Finland","Helsinki","Finn"));
        productlists.add(new Item("Francia","Paris","Frances/ Francesa; Galo",R.drawable.france,"France","Paris","Frenchman"));
        productlists.add(new Item("Gabon","Libreville","Gabones",R.drawable.gabon,"Gabon","Libreville","Gabonese"));
        productlists.add(new Item("Gambia","Banjul","Gambiense, Gambiano",R.drawable.gambia,"Gambia","Banjul","Gambian"));
        productlists.add(new Item("Georgia","Tiflis","Georgiano/a",R.drawable.georgia,"Georgia","Tbilisi","Georgian"));
        productlists.add(new Item("Alemania","Berlin","Aleman/a, Germano/a, Teuton",R.drawable.germany,"Germany","Berlin","German"));
        productlists.add(new Item("Ghana","Accra","Ghanes",R.drawable.ghana,"Ghana","Accra","Ghanian"));
        productlists.add(new Item("Grecia","Atenas","Griego/a",R.drawable.greece,"Greece","Athens","Greek"));
        productlists.add(new Item("Granada","Saint George","Granadino/a",R.drawable.grenada,"Grenada","St. George","Grenadian"));
        productlists.add(new Item("Guatemala","Ciudad De Guatemala","Guatemalteco/a",R.drawable.guatemala,"Guatemala","Guatemala","Guatemalan"));
        productlists.add(new Item("Guinea","Conakry","Guineano/a",R.drawable.guinea,"Guinea","Conakry","Guinean"));
        productlists.add(new Item("Guinea-Bissau","Bissau","Guineano/a",R.drawable.guineabissau,"Guinea Bissau","Bissau","Guinean"));
        productlists.add(new Item("Guyana","Georgetown","Guyanes",R.drawable.guam,"Guyana","Georgetown","Guyanese"));
        productlists.add(new Item("Haiti","Puerto Principe","Haitiano/a",R.drawable.haiti,"Haiti","Port Au Prince","Haitian"));
        productlists.add(new Item("Honduras","Tegucigalpa","Hondureño/a",R.drawable.honduras,"Honduras","Tegucigalpa","Honduran"));
        productlists.add(new Item("Hungria","Budapest","Hungaro/a",R.drawable.hungary,"Hungary","Budapest","Hungarian"));
        productlists.add(new Item("Islandia","Reikiavik","Islandes/ Islandesa",R.drawable.iceland,"Iceland","Reykjavik","Icelander"));
        productlists.add(new Item("India","Nueva Delhi","Indio/a",R.drawable.india,"India","New Delhi","Indian"));
        productlists.add(new Item("Indonesia","Yakarta","Indonesio",R.drawable.indonesia,"Indonesia","Yakarta","Indonesian"));
        productlists.add(new Item("Irlanda","Dublin","Irlandes/ Irlandesa",R.drawable.ireland,"Ireland","Dublin","Irishman"));
        productlists.add(new Item("Italia","Roma","Italiano/a",R.drawable.italy,"Italy","Rome","Italian"));
        productlists.add(new Item("Costa De Marfil","Yamusukro, Abiyan","Marfileño/a",R.drawable.ivorycoast,"Ivory Coast","Yamoussoukro","Ivorian"));
        productlists.add(new Item("Jamaica","Kingston","Jamaicano/a",R.drawable.jamaica,"Jamaica","Kingston","Jamaican"));
        productlists.add(new Item("Japon","Tokio","Japones/a, Nipon/a",R.drawable.japan,"Japan","Tokyo","Japanese"));
        productlists.add(new Item("Kazajistan","Astana","Kazajo",R.drawable.kazakhstan,"Kazakhstan","Astana","Kazakh"));
        productlists.add(new Item("Kenia","Nairobi","Keniata",R.drawable.kenya,"Kenya","Nairobi","Kenyan"));
        productlists.add(new Item("Kiribati","Tarawa","Kiribatense, Kiribatiano/a",R.drawable.kiribati,"Kiribati","Tarawa","I-Kiribati"));
        productlists.add(new Item("Laos","Vientian","Laosiano/a",R.drawable.laos,"Laos","Vientiane","Laotian"));
        productlists.add(new Item("Letonia","Riga","Leton/ Letona",R.drawable.latvia,"Latvia","Riga","Latvian"));
        productlists.add(new Item("Lesoto","Maseru","Basuto, Lesotense",R.drawable.lesotho,"Lesotho","Maseru","Basotho"));
        productlists.add(new Item("Liberia","Monrovia","Liberiano/a",R.drawable.liberia,"Liberia","Monrovia","Liberian"));
        productlists.add(new Item("Libia","Tripoli","Libio",R.drawable.libya,"Libya","Tripoli","Lybian"));
        productlists.add(new Item("Liechtenstein","Vaduz","Liechtensteiniano/a; Liechtentiense",R.drawable.liechtenstein,"Liechtenstein","Vaduz","Liechtensteiner"));
        productlists.add(new Item("Lituania","Vilna","Lituano/a",R.drawable.lithuania,"Lithuania","Vilnius","Lithuanian"));
        productlists.add(new Item("Luxemburgo","Luxemburgo","Luxemburgues/a",R.drawable.luxembourg,"Luxembourg","Luxembourg City","Luxembourger"));
        productlists.add(new Item("Macedonia","Skopie","Macedonio/a",R.drawable.republicofmacedonia,"Macedonia","Skopje","Macedonian"));
        productlists.add(new Item("Republica De Macedonia","Skopje","Macedonio/a",R.drawable.republicofmacedonia,"Macedonia","Skopje","Macedonian"));
        productlists.add(new Item("Madagascar","Antananarivo","Malgache",R.drawable.madagascar,"Madagascar","Antananarivo","Madagascan"));
        productlists.add(new Item("Malaui","Lilongüe","Malawiano/a",R.drawable.malawi,"Malawi","Lilongwe","Malawian"));
        productlists.add(new Item("Malasia","Kuala Lumpur","Malayo/a",R.drawable.malasya,"Malaysia","Kuala Lumpur","Malay"));
        productlists.add(new Item("Maldivas","Male","Maldivo/a",R.drawable.maldives,"Maldives","Male","Maldivan"));
        productlists.add(new Item("Mali","Bamako","Mali",R.drawable.mali,"Mali","Bamako","Malian"));
        productlists.add(new Item("Malta","La Valeta","Maltes/ Maltesa",R.drawable.malta,"Malta","Valletta","Maltese"));
        productlists.add(new Item("Islas Marshall","Majuro","Marshales",R.drawable.marshallisland,"Marshall Islands","Majuro","Marshallese"));
        productlists.add(new Item("Mauritania","Nuakchot","Mauritano",R.drawable.mauritania,"Mauritania","Nouakchott","Mauritanian"));
        productlists.add(new Item("Mauricio","Port Louis","Mauriciano",R.drawable.mauritius,"Mauritius","Port Louis","Mauritian"));
        productlists.add(new Item("Mexico","Mexico D. F.","Mexicano/a",R.drawable.mexico,"Mexico","Mexico City","Mexican"));
        productlists.add(new Item("Moldavia","Chisinau","Moldavo",R.drawable.moldova,"Moldova","Chisinau","Moldavian"));
        productlists.add(new Item("Monaco","Monaco","Monegasco/a",R.drawable.monaco,"Monaco","Monaco Ville","Monegasque"));
        productlists.add(new Item("Mongolia","Ulan Bator","Mongol",R.drawable.mongolia,"Mongolia","Ulaanbaatar","Mongolian"));
        productlists.add(new Item("Marruecos","Rabat","Marroqui",R.drawable.morocco,"Morocco","Rabat","Morocan"));
        productlists.add(new Item("Mozambique","Maputo","Mozambiqueño/a",R.drawable.mozambique,"Mozambique","Maputo","Mozambican"));
        productlists.add(new Item("Namibia","Windhoek","Namibio",R.drawable.namibia,"Namibia","Windhoek","Namibian"));
        productlists.add(new Item("Nauru","Yaren","Nauruano",R.drawable.nauru,"Nauru"," Yaren","Nauruan"));
        productlists.add(new Item("Nueva Zelanda","Wellington","Neozelandes",R.drawable.newzealand,"New Zealand","Wellington","New Zealander"));
        productlists.add(new Item("Nicaragua","Managua","Nicaragüense",R.drawable.nicaragua,"Nicaragua","Managua","Nicaraguan"));
        productlists.add(new Item("Niger","Niamey","Nigeriano/a",R.drawable.niger,"Niger","Niamey","Nigerian"));
        productlists.add(new Item("Nigeria","Abuya","Nigeriano/a",R.drawable.nigeria,"Nigeria","Abuja","Nigerian"));
        productlists.add(new Item("Corea Del Norte","Pyongyang","(Nor)Coreano/a",R.drawable.northkorea,"North Corea","Pyongyang","Corean"));
        productlists.add(new Item("Noruega","Oslo","Noruego/a",R.drawable.norway,"Norway","Oslo","Norwegian"));
        productlists.add(new Item("Pakistan","Islamabad","Pakistani",R.drawable.pakistan,"Pakistan","Islamabad","Pakistani"));
        productlists.add(new Item("Panama","Ciudad De Panama","Panameño/a",R.drawable.panama,"Panama","Panama City","Panamanian"));
        productlists.add(new Item("Papua Nueva Guinea","Port Moresby","Papu",R.drawable.papuanewguinea,"Papua New Guinea","Port Moresby","Papuan New Guinean"));
        productlists.add(new Item("Paraguay","Asuncion","Paraguayo/a",R.drawable.paraguay,"Paraguay","Asuncion","Paraguayan"));
        productlists.add(new Item("Peru","Lima","Peruano/a",R.drawable.peru,"Peru","Lima","Peruvian"));
        productlists.add(new Item("Filipinas","Manila","Filipino/a",R.drawable.philippines,"Philippines","Manila","Filipino"));
        productlists.add(new Item("Polonia","Varsovia","Polaco/a",R.drawable.poland,"Poland","Varsaw","Pole"));
        productlists.add(new Item("Portugal","Lisboa","Portugues/ Portuguesa",R.drawable.portugal,"Portugal","Lisbon","Portuguese"));
        productlists.add(new Item("Puerto Rico","San Juan","Portorriqueño/a; Boricua",R.drawable.puertorico,"Puerto Rico","San Juan","Puerto Rican"));
        productlists.add(new Item("Rumania","Bucarest","Rumano/a",R.drawable.romania,"Romania","Bucharest","Romanian"));
        productlists.add(new Item("Rusia","Moscu","Ruso/a",R.drawable.russia,"Russia","Moscow","Russian"));
        productlists.add(new Item("Ruanda","Kigali","Ruandes",R.drawable.rwanda,"Rwanda","Kigali","Rwandan"));
        productlists.add(new Item("San Vicente Y Las Granadinas","Kingstown","Sanvicentino/a",R.drawable.saintvincentandthegrenadines,"Saint Vincent And The Grenadines","Kingstown","Saint Vincentian Or Vincentian"));
        productlists.add(new Item("Senegal","Dakar","Senegales",R.drawable.senegal,"Senegal","Dakar","Senegalese"));
        productlists.add(new Item("Seychelles","Victoria","Seychelense",R.drawable.seychelles,"Seychelles","Victoria","Seychellois"));
        productlists.add(new Item("Sierra Leona","Freetown","Sierraleones",R.drawable.sierraleone,"Sierra Leone","Freetown","Sierra Leonian"));


        productlists.add(new Item("Singapur","Singapur","Sin Info",R.drawable.singapore,"Singapur","Singapur","Sin Info"));
        productlists.add(new Item("Tailandia","Bangkok","Sin Info",R.drawable.thailand,"Tailandia","Bangkok","Sin Info"));
        productlists.add(new Item("Dominica","Roseau","Sin Info",R.drawable.dominica,"Dominica","Roseau","Sin Info"));
        productlists.add(new Item("Yemen","Sana","Sin Info",R.drawable.yemen,"Yemen","Sana","Sin Info"));
        productlists.add(new Item("Antigua Y Barbuda","Saint John","Sin Info",R.drawable.antiguaandbarbuda,"Antigua Y Barbuda","Saint John","Sin Info"));
        productlists.add(new Item("Myanmar (Birmania)","Naypyidaw","Sin Info",R.drawable.myanmar,"Myanmar (Birmania)","Naypyidaw","Sin Info"));
        productlists.add(new Item("Vietnam","Hanoi","Sin Info",R.drawable.vietnam,"Vietnam","Hanoi","Sin Info"));
        productlists.add(new Item("Oman","Mascate","Sin Info",R.drawable.oman,"Oman","Mascate","Sin Info"));
        productlists.add(new Item("Banglades","Daca","Sin Info",R.drawable.bangladesh,"Banglades","Daca","Sin Info"));
        productlists.add(new Item("Emiratos Arabes Unidos","Abu Dabi","Sin Info",R.drawable.unitedarabemirates,"Emiratos Arabes Unidos","Abu Dabi","Sin Info"));
        productlists.add(new Item("Arabia Saudita","Riad","Sin Info",R.drawable.saudiarabia,"Arabia Saudita","Riad","Sin Info"));
        productlists.add(new Item("Taiwan","Taipeh","Sin Info",R.drawable.taiwan,"Taiwan","Taipeh","Sin Info"));
        productlists.add(new Item("Catar","Doha","Sin Info",R.drawable.nocamera,"Catar","Doha","Sin Info"));
        productlists.add(new Item("Barein","Manama","Sin Info",R.drawable.bahrain,"Barein","Manama","Sin Info"));
        productlists.add(new Item("Nepal","Katmandu","Sin Info",R.drawable.nepal,"Nepal","Katmandu","Sin Info"));
        productlists.add(new Item("Kuwait","Ciudad De Kuwait","Sin Info",R.drawable.kwait,"Kuwait","Ciudad De Kuwait","Sin Info"));
        productlists.add(new Item("Israel","Jerusalen","Sin Info",R.drawable.israel,"Israel","Jerusalen","Sin Info"));
        productlists.add(new Item("Jordania","Amman","Sin Info",R.drawable.jordan,"Jordania","Amman","Sin Info"));
        productlists.add(new Item("Palestina","Ramala","Sin Info",R.drawable.palestine,"Palestina","Ramala","Sin Info"));
        productlists.add(new Item("Iraq","Bagdad","Sin Info",R.drawable.iraq,"Iraq","Bagdad","Sin Info"));
        productlists.add(new Item("Siria","Damasco","Sin Info",R.drawable.syria,"Siria","Damasco","Sin Info"));
        productlists.add(new Item("Libano","Beirut","Sin Info",R.drawable.lebanon,"Libano","Beirut","Sin Info"));
        productlists.add(new Item("Chipre","Nicosia","Sin Info",R.drawable.cyprus,"Chipre","Nicosia","Sin Info"));
        productlists.add(new Item("Iran","Teheran","Sin Info",R.drawable.iran,"Iran","Teheran","Sin Info"));
        productlists.add(new Item("Kirguistan","Biskek","Sin Info",R.drawable.kyrgyzstan,"Kirguistan","Biskek","Sin Info"));
        productlists.add(new Item("Micronesia","Palikir","Sin Info",R.drawable.micronesia,"Micronesia","Palikir","Sin Info"));
        productlists.add(new Item("Palaos","Melekeok","Sin Info",R.drawable.palau,"Palaos","Melekeok","Sin Info"));
        productlists.add(new Item("Timor Oriental","Dili","Sin Info",R.drawable.easttimor,"Timor Oriental","Dili","Sin Info"));
        productlists.add(new Item("Republica Saharaui","El Aaiun","Sin Info",R.drawable.sahrawiarabdemocraticrepublic,"Republica Saharaui","El Aaiun","Sin Info"));
        productlists.add(new Item("Santo Tome Y Principe","Santo Tome","Sin Info",R.drawable.saotomeandprince,"Santo Tome Y Principe","Santo Tome","Sin Info"));
        productlists.add(new Item("Sudan Del Sur","Yuba","Sin Info",R.drawable.southsudan,"Sudan Del Sur","Yuba","Sin Info"));
        productlists.add(new Item("Kosovo","Pristina","Sin Info",R.drawable.kosovo,"Kosovo","Pristina","Sin Info"));
        productlists.add(new Item("Montenegro","Podgorica","Sin Info",R.drawable.montenegro,"Montenegro","Podgorica","Sin Info"));
        productlists.add(new Item("San Marino","Ciudad De San Marino","Sin Info",R.drawable.sanmarino,"San Marino","Ciudad De San Marino","Sin Info"));
        productlists.add(new Item("Serbia","Belgrado","Sin Info",R.drawable.serbia,"Serbia","Belgrado","Sin Info"));
        productlists.add(new Item("Vaticano","Ciudad Del Vaticano","Sin Info",R.drawable.vaticancity,"Vaticano","Ciudad Del Vaticano","Sin Info"));
        productlists.add(new Item("Eslovaquia","Bratislava","Eslovaco/a",R.drawable.slovakia,"Slovakia","Bratislava","Slovak"));
        productlists.add(new Item("Eslovenia","Lublijana","Esloveno/a",R.drawable.slovenia,"Slovenia","Ljubljana","Slovene"));
        productlists.add(new Item("Islas Salomon","Honiara","Salomonense",R.drawable.solomonislands,"Solomon Islands","Honiara","Solomon"));
        productlists.add(new Item("Somalia","Mogadiscio","Somali",R.drawable.somalia,"Somalia","Mogadeshu","Somalian"));
        productlists.add(new Item("Sudafrica","Pretoria, Ciudad Del Cabo, Bloemfontein","Sudafricano/a",R.drawable.southafrica,"South Africa","Cape Town","Southafrican"));
        productlists.add(new Item("Corea Del Sur","Seul","(Sur)Coreano/a",R.drawable.southkorea,"South Corea","Seoul","Corean"));
        productlists.add(new Item("España","Madrid","Español/a",R.drawable.spain,"Spain","Madrid","Spaniard"));
        productlists.add(new Item("Sri Lanka","Sri Jayawardenapura","Esrilanques/Sa (Ceilandes)",R.drawable.srilanka,"Sri Lanka","Sri Jayawardenepura Kotte","Sri Lankan"));
        productlists.add(new Item("San Cristobal Y Nieves","Basseterre","Sancristobalense",R.drawable.christmasisland,"St. Kitts & Nevis","Basseterre","Kittitian, Nevisian"));
        productlists.add(new Item("Santa Lucia","Castries","Santalucense",R.drawable.stlucia,"St. Lucia","Castries","Saint Lucian"));
        productlists.add(new Item("Sudan Del Norte","Jartum","Sudanes",R.drawable.sudan,"Sudan","Khartuoum","Sudanese"));
        productlists.add(new Item("Surinam","Paramaribo","Surinames",R.drawable.suriname,"Surinam","Paramaribo","Surinamese"));
        productlists.add(new Item("Suazilandia","Mbabane","Suazi",R.drawable.swaziland,"Swaziland","Mbabane","Swazi"));
        productlists.add(new Item("Suecia","Estocolmo","Sueco/a",R.drawable.sweden,"Sweden","Stockholm","Swede"));
        productlists.add(new Item("Suiza","Berna","Suizo/a",R.drawable.switzerland,"Switzerland","Bern","Swiss"));
        productlists.add(new Item("Tayikistan","Dusambe","Tadzhik, Tayiko",R.drawable.tajikistan,"Tajikistan","Dushanbe","Tajik"));
        productlists.add(new Item("Tanzania","Dodoma","Tanzano",R.drawable.tanzania,"Tanzania","Dodoma","Tanzanian"));
        productlists.add(new Item("Paises Bajos","Amsterdam","Neerlandes; Holandes/ Holandesa",R.drawable.netherlands,"The Netherlands","Amsterdam (The Hague, Seat Of Government)","Dutchman, Netherlander, Hollander"));
        productlists.add(new Item("Togo","Lome","Togoles",R.drawable.togo,"Togo","Lome","Togolese"));
        productlists.add(new Item("Tonga","Nuku","Tongano",R.drawable.tonga,"Tonga","Nukualofa","Tongan"));
        productlists.add(new Item("Trinidad Y Tobago","Puerto España","Trinitario/a",R.drawable.trinidadandtobago,"Trinidad and Tobago","Port Of Spain","Trinidadian"));
        productlists.add(new Item("Tunez","Tunez","Tunecino/a",R.drawable.tunisia,"Tunisia","Tunis","Tunisian"));
        productlists.add(new Item("Turquia","Ankara","Turco",R.drawable.turkey,"Turkey","Ankara","Turk"));
        productlists.add(new Item("Turkmenistan","Asjabad","Turcomano, Turkmenio/a",R.drawable.turkmenistan,"Turkmenistan","Ashgabat","Turkman"));
        productlists.add(new Item("Tuvalu","Funafuti","Tuvaluano/a",R.drawable.tuvalu,"Tuvalu","Funafuti","Tuvaluan"));
        productlists.add(new Item("Uganda","Kampala","Ugandes",R.drawable.uganda,"Uganda","Kampala","Ugandan"));
        productlists.add(new Item("Ucrania","Kiev","Ucraniano/a",R.drawable.ukraine,"Ukraine","Kiev","Ukrainian"));
        productlists.add(new Item("Estados Unidos","Washington D.C.","Estadounidense",R.drawable.unitedstates,"United States, Usa","Washington D.C","American"));
        productlists.add(new Item("Uruguay","Montevideo","Uruguayo/a",R.drawable.uruguay,"Uruguay","Montevideo","Uruguayan"));
        productlists.add(new Item("Uzbekistan","Tashkent","Uzbeko",R.drawable.uzbekistn,"Uzbekistan","Tashkent","Uzbek"));
        productlists.add(new Item("Vanuatu","Port Vila","Vanuatuense",R.drawable.vanuatu,"Vanuatu","Port-Vila, Vila","Ni-Vanuatu"));
        productlists.add(new Item("Venezuela","Caracas","Venezolano/a",R.drawable.venezuela,"Venezuela","Caracas","Venezuelan"));
        productlists.add(new Item("Samoa","Apia","Samoano/a",R.drawable.samoa,"Western Samoa","Apia","Samoan"));
        productlists.add(new Item("Zambia","Lusaka","Zambiano",R.drawable.zambia,"Zambia","Lusaka","Zambian"));
        productlists.add(new Item("Zimbabue","Harare","Zimbabuense, Zimbabues, Zimbabuo/A",R.drawable.zimbabwe,"Zimbabwe","Harare","Zimbabwean"));


        /*
        * FIN INSERTAR INFORMACION
        * */


        listshowrcy = (RecyclerView) findViewById(R.id.listshow);
        listshowrcy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        listshowrcy.setLayoutManager(linearLayoutManager);
        adapter=new MainActivityAdapter(productlists,ActSearch.this);   //actSearch por MainActivity
        listshowrcy.setAdapter(adapter);

    }//FIN ON CREATE

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.searchfile, menu);
        final MenuItem myActionMenuItem = menu.findItem(R.id.searchnuevo);
        searchView1 = (SearchView) myActionMenuItem.getActionView();
        changeSearchViewTextColor(searchView1);
        ((EditText) searchView1.findViewById(android.support.v7.appcompat.R.id.search_src_text)).setHintTextColor(getResources().getColor(R.color.white));

        searchView1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (!searchView1.isIconified()) {
                    searchView1.setIconified(true);
                }
                myActionMenuItem.collapseActionView();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                final List<Item> filtermodeList=filter(productlists,newText);
                adapter.setfilter(filtermodeList);
                return true;
            }
        });
        return true;
    }

    private List<Item> filter (List<Item> p1, String query){

        query=query.toLowerCase();
        final List<Item> filteredModeList = new ArrayList<>();
        for (Item model:p1){

            final String text=model.getCountry().toLowerCase();
            if (text.startsWith(query)){
               filteredModeList.add(model);
            }
        }
        return filteredModeList;
    }

    private void changeSearchViewTextColor(View view){
        if (view != null){
            if (view instanceof TextView){
                ((TextView)view).setTextColor(Color.WHITE);
                return;
            }else if (view instanceof ViewGroup){
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++){
                    changeSearchViewTextColor(viewGroup.getChildAt(i));
                }
            }
        }
    }
}
