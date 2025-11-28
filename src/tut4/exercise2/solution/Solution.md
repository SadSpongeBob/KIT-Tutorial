# Solution

The problems with class [Cone](Cone.java) were:

- Class definition must not be `private`
- Constants should be written in `UPPER_CASE`
- Attributes and the constant must be `private`
- Constructor parameter `height` should be primitive or include `null`-check
- `getSlantHeight(Circle base, double height)` can be static or use class
attributes
- `getSlantHeight()` must not be private
- `getHeight()` must not be private
- `base, height` and `slantHeight` remain unchanged -> should be `final`
