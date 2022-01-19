# Quantities converter

As a personal challenge to an app development, I build this class to properly deal with scientific data on random generated texts. This very class (Quantity) tries to abstract physical quantities.

A special method that I wrote (converter) is applied on an object of this class with a String object as argument: the unit which is needed the object to be converted. The method analyzes specific attributes of the Quantity object and, according to the argument, resets its value and unit attributes.

The method is based on the constant String 3D-matrix UNITS to avoid exceptions.
