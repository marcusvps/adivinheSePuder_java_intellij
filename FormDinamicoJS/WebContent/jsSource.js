/**
 * 
 */


function OnOffInputs(idInput){
	if(idInput.id.localeCompare("inameid") == 0){
		onOffInputCpf(idInput);
		
	}else if(idInput.id.localeCompare("icpfid") == 0){
		onOffInputDataNasc(idInput);
		
	}else if(idInput.id.localeCompare("idatanascimentoid") == 0){
		onOffInputSexo(idInput);
	}
	
}

function onOffInputCpf(idInput){
	var cpfInput = document.getElementById("icpfid");
	if(idInput.value != ""){
		cpfInput.disabled = false;
	}else{
		cpfInput.disabled = true;
		onOffInputDataNasc(idInput);
	}
}

function onOffInputDataNasc(idInput){
	var dataNascInput = document.getElementById("idatanascimentoid");
	if(idInput.value != ""){
		dataNascInput.disabled = false;
	}else{
		dataNascInput.disabled = true;
		onOffInputSexo(idInput);
	}
}

function onOffInputSexo(idInput){
	var sexoInput = document.getElementsByName("sexo");
	var count;
	
	if(idInput.value != ""){
		for(count = 0; count < sexoInput.length; count++){
			sexoInput[count].disabled = false;
		}
		
	}else{
		for(count = 0; count < sexoInput.length; count++){
			sexoInput[count].disabled = true;
		}
	}
}
