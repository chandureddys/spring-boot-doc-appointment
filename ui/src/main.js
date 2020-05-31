import App from './App.svelte';

const app = new App({
	target: document.body,
	props: {
		name: 'welcome to doc-appointment'
	}
});

export default app;