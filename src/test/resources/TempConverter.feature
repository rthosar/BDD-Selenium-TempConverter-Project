@f1
Feature: Develope a Centigrade to Fahrenheit 
	Temparature Converter
	
	Scenario Outline: Centigrade to Fahrenheit Temparature Converter		
		Given click on "<button1>" 
		And Enter the temparature <temperature> in Centigrade
		When click on "<button2>" 
		Then the temparature should be equal to <output> Fahrenheit
			
			Examples:
			| button1  | temperature    | button2   |  output    |
			| Reset    | 20.00          | Convert   |  68.00     |
			