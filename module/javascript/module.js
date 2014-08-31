// Expose the native API to javascript
forge.opus_tokbox = {
    showAlert: function (text, success, error) {
        forge.internal.call('opus_tokbox.showAlert', {text: text}, success, error);
    }
};

// Register for our native event
forge.internal.addEventListener("opus_tokbox.resume", function () {
	alert("Welcome back!");
});
