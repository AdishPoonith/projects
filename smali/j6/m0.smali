.class public final synthetic Lj6/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/p0;

.field public final synthetic k:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:Lcom/google/firebase/firestore/a0;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/m0;->j:Lj6/p0;

    iput-object p2, p0, Lj6/m0;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lj6/m0;->l:Landroid/content/Context;

    iput-object p4, p0, Lj6/m0;->m:Lcom/google/firebase/firestore/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj6/m0;->j:Lj6/p0;

    iget-object v1, p0, Lj6/m0;->k:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lj6/m0;->l:Landroid/content/Context;

    iget-object v3, p0, Lj6/m0;->m:Lcom/google/firebase/firestore/a0;

    invoke-static {v0, v1, v2, v3}, Lj6/p0;->g(Lj6/p0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/a0;)V

    return-void
.end method
