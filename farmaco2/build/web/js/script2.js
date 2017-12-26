// JavaScript Document
var arr = new Array();

arr[0] = new Array ("Selecione");
arr[1] = new Array ("Marca do Carro","Ford","Chevrolet","Fiat","Volkswagem","Peugeot","Hyundai",
"Audi","Citroen","Renault","Jeep","KIA","Suzuky","Toyota","Mercedes Benz","Ferrari");
arr[2] = new Array ("Marca da Moto","Honda","Yamaha","Suzuky","BMW","Kawasaki","Ducati","kasinski","Harley_Davidson");
arr[3] = new Array ("taguatinga","ceilandia","brasilandia");
arr[4] = new Array ("taguatinga","ceilandia","brasilandia");


var arr2 = new Array();

arr2[0] = new Array ("Fiesta","ford_KA");
arr2[1] = new Array ("Marca do Carro","Ford","Chevrolet","Fiat","Volkswagem","Peugeot","Hyundai",
"Audi","Citroen","Renault","Jeep","KIA","Suzuky","Toyota","Mercedes Benz","Ferrari");
arr2[2] = new Array ("Marca da Moto","Honda","Yamaha","Suzuky","BMW","Kawasaki","Ducati","kasinski","Harley_Davidson");
arr2[3] = new Array ("taguatinga","ceilandia","brasilandia");
arr2[4] = new Array ("taguatinga","ceilandia","brasilandia");

function change(combo1)
{
	var comboValue = combo1.value;	
	document.forms["form1"].elements["combo2"].options.length=0;/*primeiro valor a ser atribuido tem valor zero*/
	for (var i = 0;i<arr[comboValue].length;i++)
	{
		var option = document.createElement ('option');
		option.setAttribute("value",i+1);
		option.innerHTML = arr[comboValue][i];
		document.forms["form1"].elements["combo2"].appendChild(option);	
		
	}
}


function populate3(s1,s2)
{
	var s1 = document.getElementById(s1);
	var s2 = document.getElementById(s2);
	s2.innerHTML = "";
	if (s1.value == "2"){/*ford é o 2 da lista array*/
		var optionArray = ["|","camaro|camaro","corvet|corvet"];	
	}
	if (s1.value == "3"){/*ford é o 2 da lista array*/
		var optionArray = ["|","palio|palio","punto|punto"];	
	}
	for(var option in optionArray){
		var pair = optionArray[option].split("|");
	    var newOption = document.createElement("option");
		newOption.value = pair[0];  
		newOption.innerHTML = pair[1];
		s2.options.add(newOption);
	}
	
}