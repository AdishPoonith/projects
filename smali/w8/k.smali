.class public final synthetic Lw8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lw8/o;

.field public final synthetic b:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic c:Lr8/d$b;


# direct methods
.method public synthetic constructor <init>(Lw8/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/k;->a:Lw8/o;

    iput-object p2, p0, Lw8/k;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p3, p0, Lw8/k;->c:Lr8/d$b;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, Lw8/k;->a:Lw8/o;

    iget-object v1, p0, Lw8/k;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v2, p0, Lw8/k;->c:Lr8/d$b;

    invoke-static {v0, v1, v2, p1}, Lw8/o;->e(Lw8/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr8/d$b;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
