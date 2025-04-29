.class public final synthetic Lcom/google/firebase/firestore/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/d1;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/d1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/c1;->a:Lcom/google/firebase/firestore/d1;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c1;->a:Lcom/google/firebase/firestore/d1;

    invoke-static {v0, p1}, Lcom/google/firebase/firestore/d1;->a(Lcom/google/firebase/firestore/d1;Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/n;

    move-result-object p1

    return-object p1
.end method
