3:00 to 3:30 --->Cucumber stepdefinition and runner class
3:30 to 3:45 ---> Breakout
3:45 to 4:15 ---> Parametrization
4:15 to 4:30 ---> Breakout
4:30 to 5:00 ---> Multiple data
5:00 to 5:10 --->Break
5:10 to 5:45 ---> Hooks implementation and tags
5:45 to 6:00 --->Recap

Parameterization:
1)surround the datas with the single quote in feature file
2)In the S.D class replace the data with{string}
3)pass the i/p args to the mtd and replace the hardcoded data with the args.

exceptions:
1)Undefined step Definition--->when a step is not defined in step definition class which we created in featurefile.
2)duplicate step definition--->when same methods are duplicated in step definition
3)invalid method exception--->whwn one step definition class extend another step definition class
4)Null pointer exception---->if the driver is not static for multiple step definitions.