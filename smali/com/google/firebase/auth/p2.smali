.class final Lcom/google/firebase/auth/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic j:Lcom/google/firebase/auth/FirebaseAuth$a;

.field final synthetic k:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseAuth$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/p2;->k:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/p2;->j:Lcom/google/firebase/auth/FirebaseAuth$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/p2;->j:Lcom/google/firebase/auth/FirebaseAuth$a;

    iget-object v1, p0, Lcom/google/firebase/auth/p2;->k:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-interface {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth$a;->a(Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method
