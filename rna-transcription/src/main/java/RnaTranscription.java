class RnaTranscription {

    String transcribe(String dnaStrand) {
        
        String rnaStrand = "";
        
        for (char nucleotide : dnaStrand.toCharArray()) {
            if ( nucleotide == 'G' ) rnaStrand += 'C';
            else if ( nucleotide == 'C') rnaStrand += 'G';
            else if ( nucleotide == 'T' ) rnaStrand += 'A';
            else if ( nucleotide == 'A' ) rnaStrand += 'U';
        }
        
        return rnaStrand;
    }
}
