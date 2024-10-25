<template>

    <v-data-table
        :headers="headers"
        :items="mypage"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MypageView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileSize", value: "fileSize" },
                { text: "fileId", value: "fileId" },
                { text: "fileName", value: "fileName" },
                { text: "indexingYn", value: "indexingYn" },
                { text: "uploadYn", value: "uploadYn" },
                { text: "videoUrl", value: "videoUrl" },
                { text: "uploadDt", value: "uploadDt" },
                { text: "userId", value: "userId" },
            ],
            mypage : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/mypages'))

            temp.data._embedded.mypages.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.mypage = temp.data._embedded.mypages;
        },
        methods: {
        }
    }
</script>

