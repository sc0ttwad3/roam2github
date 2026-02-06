### Objectives
- Update an existing Roam Research graph using the latest Roam3 template version.
- Ensure proper configuration of environment variables for GitHub Actions workflow.
- Verify the required repository secrets are set for automated synchronization.
- Manually trigger the GitHub synchronization workflow after template updates.
- Merge new Roam3 template pages into the existing Roam Research graph structure.
### Instructions
1. **Access GitHub Repository Settings:** Navigate to the GitHub repository that is linked to your Roam Research graph.
2. **Verify Repository Secrets:** Go to "Settings," then "Secrets and variables," and select "Actions."
3. **Confirm Credentials:** Ensure that the repository secrets `ROAM_USER` and `ROAM_PASS` are correctly set with your Roam Research credentials.
4. **Obtain Updated Template Pages:** Access the source `Roam3` template graph (or the location of the latest updates).
5. **Copy Update Pages:** Copy the necessary updated pages (e.g., the `Roam3/Github/Update` page) from the template source into your personal Roam Research graph.
6. **Trigger Synchronization Action:** Return to your GitHub repository and select the "Actions" tab.
7. **Manually Run Workflow:** Locate the `roam-sync` workflow and manually trigger a new run.
8. **Monitor and Verify:** Check the workflow run logs to confirm that the synchronization completed successfully and that the new template pages were correctly merged.
9. **Troubleshoot Conflicts:** If the workflow fails, review the specific error messages in the logs to identify and resolve any synchronization conflicts or configuration issues.
