var array = [90,10,30,40,5,8];


function getContent() {
	

	document.getElementById('array').innerHTML = "Array : " + array;
	var ascArr = array.sort(function(a,b){return a-b});
	
	document.getElementById('ascArr').innerHTML = "Ascending Order Array : " + ascArr;

	var len = array.length;
	var middle = len/2;
	array.splice(middle,0,23);
	document.getElementById('newArr').innerHTML = "Element 23 Added at Middle : " + array;

	array.unshift(15);
	document.getElementById('newArr2').innerHTML = "Element 15 Added at Starting : " + array;

	
	array = array.map(function(n){return n*2});
	document.getElementById('mulResult').innerHTML = "Multiply Every Element with 2 : " + array;


	


}