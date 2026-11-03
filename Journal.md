# Journal
Write your Journal questions and notes here.

Phase 1-
Created a common interface for a remote item and proxy to share, created the remote item, and the proxy. This allows someone to use a remote item without knowing where its at by taking the calls in the proxy and routing to the appropriate remote location.

Phase 2-
Created a Virtual proxy that lazy loads into the RealMedia object in upon request instead of loading at the creation of the proxy. The remote proxy that establishes and manages a connection to a remote location, and the Virtual proxy can wait to load the object that it is proxying untill it is needed to save resources. The only problem with the Lazy loading is the Virtual proxy will most likely need full knowlege of what is needed to instantiate the object when needed, this could be done with read from disk but in this case I hardcoded. 
