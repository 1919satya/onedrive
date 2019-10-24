function generatePatterns() {
	var i,j;
	var div1 = document.getElementById("div1");
	var div2 = document.getElementById("div2");
	var div3 = document.getElementById("div3");
	var div4 = document.getElementById("div4");
	
	var result = "<p>";
	for(i = 1; i <= 5; i++) {
		for(j = 1; j <= i; j++) {
			result += j+" ";
		}
		result +="<br>";
	}
	result += "</p>";
	div1.innerHTML = result;
	result = " ";
	
	
	for(i = 5; i >= 1; i--) {
		j=i;
		while(j > 0) {
			result += i+" ";
			j--;
		}
		result +="<br>";
	}
	result += "</p>";
	div2.innerHTML = result;
	
	result = " ";

	for(i = 5; i >= 1; i--) {
		j=i;
		while(j > 0) {
			result += j+" ";
			j--;
		}
		result +="<br>";
	}
	result += "</p>";
	div3.innerHTML = result;
	result = " ";

	
	for(i = 5; i >= 1; i--) {
		j=i;
		while(j > 0) {
			result += 5+" ";
			j--;
		}
		result +="<br>";
	}
	result += "</p>";
	div4.innerHTML = result;
	
	result = " ";
}