# Quantities converter

As a personal challenge to an app development, I build these classes to properly deal with scientific data on random generated texts. The main class of these, Quantity abstracts physical quantities.

A special method that I wrote (convertUnitTo) is applied on an object of this class with a Unit (enum) instance as argument: the unit which is needed the object to be converted. The method analyzes specific attributes of the Quantity object and, according to the argument, resets its value and unit attributes.

The method is based on the attributes registered in the enumerator Unit; one of this properties is the factor to convert to the respective SI system by multiplication.
