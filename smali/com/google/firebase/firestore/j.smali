.class public final synthetic Lcom/google/firebase/firestore/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/j;->a:Lcom/google/firebase/firestore/m;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/j;->a:Lcom/google/firebase/firestore/m;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/m;->c(Lcom/google/firebase/firestore/m;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    return-object p1
.end method
