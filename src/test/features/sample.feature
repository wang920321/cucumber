Feature: Belly

 

Scenario Outline: a few cukes

Given I have <cukes> cukes in my belly

When I wait <hour> hour

Then my belly should <sound>
Examples:

| cukes  | hour   | sound    |

|    30    |  1         |  silent  |

|    42    |  2         |  growl   |

|    43    |  0         |  silent  |
|    31    |  2         |  silent  |