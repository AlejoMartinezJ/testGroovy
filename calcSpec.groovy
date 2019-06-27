class calcSpec {
     def setup() {
         echo "first code in groovy"
         sh "mvm clean"
         echo "finish remove target"
     }
}
