Donut
=====

An ambitious project, which eventually is intended to provide a full gamut representation of Nutrition facts menus for restaurants, a comparison between [Dietary Reference Intakes](http://www.hc-sc.gc.ca/fn-an/nutrition/reference/index-eng.php),  eventually linking to existing [USDA database](http://ndb.nal.usda.gov/) or equivalent, and provide a health analysis outputting information how closely the meals fulfil dietary requirements, and furthermore compare against different standards such as those that are overseas or outdated. An ultimate long term goal may be significant automation pulling from online databases, and to make it as easy as possible to enter foods consumed.

Another goal is to demonstrate mastery of Java object-oriented concepts, including inheritance, encapsulation, polymorphism. This to be demonstrated with `abstract  class`, `interface`, and so forth.  Named Donut in honor of the inspiring moment where I decided to track the absurdity of measuring objectively the health benefit of a series of sweet delicious foods. It's a temporary placeholder name.

#### Status
Design in progress. No front end. Tester class contains logic for populating and triggering.

#### Performance
This concept clearly won't perform well with the millions of records that the USDA database provides, the memory footprint is too high to store every food item as an object. That data will go into database and be queried instead. A major refactoring stage would occur later, once familiarized with problem-domain.

Current:
![readme image][1]

Simpler:
![readme image][2]

  [1]: https://raw.githubusercontent.com/nastajus/Donut/master/diagram.png
  [2]: https://raw.githubusercontent.com/nastajus/Donut/master/diagram2.png
  
