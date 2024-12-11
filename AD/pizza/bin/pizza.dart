import 'dart:io';
void main()
{
  print("Pizza prices: Small - 150 Rs, Medium - 190 Rs, Large - 240 Rs");
  print("Please enter your pizza size (Small, Medium, Large):");

  String pizzaSize=stdin.readLineSync()!;

  print("How many $pizzaSize pizzas do you want?");

  int pizzaQty=int.parse(stdin.readLineSync()!);

  if(pizzaSize=='Small')
  {
    var result=pizzaQty*150;
    print("Your Total Payment is: $result");
  }
  else if(pizzaSize=='Medium')
  {
    var result=pizzaQty*190;
    print("Your Total Payment is: $result");
  }
  else if(pizzaSize=='Large')
  {
    var result=pizzaQty*240;
    print("Your Total Payment is: $result");
  }
  else
  {
    print("Invalid Pizza Size Input");
  }
}