.class public final synthetic Lcom/google/firebase/auth/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/h;


# instance fields
.field public final synthetic a:Lb6/f0;

.field public final synthetic b:Lb6/f0;

.field public final synthetic c:Lb6/f0;

.field public final synthetic d:Lb6/f0;

.field public final synthetic e:Lb6/f0;


# direct methods
.method public synthetic constructor <init>(Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/f1;->a:Lb6/f0;

    iput-object p2, p0, Lcom/google/firebase/auth/f1;->b:Lb6/f0;

    iput-object p3, p0, Lcom/google/firebase/auth/f1;->c:Lb6/f0;

    iput-object p4, p0, Lcom/google/firebase/auth/f1;->d:Lb6/f0;

    iput-object p5, p0, Lcom/google/firebase/auth/f1;->e:Lb6/f0;

    return-void
.end method


# virtual methods
.method public final a(Lb6/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/firebase/auth/f1;->a:Lb6/f0;

    iget-object v1, p0, Lcom/google/firebase/auth/f1;->b:Lb6/f0;

    iget-object v2, p0, Lcom/google/firebase/auth/f1;->c:Lb6/f0;

    iget-object v3, p0, Lcom/google/firebase/auth/f1;->d:Lb6/f0;

    iget-object v4, p0, Lcom/google/firebase/auth/f1;->e:Lb6/f0;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/auth/FirebaseAuthRegistrar;->lambda$getComponents$0(Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;Lb6/f0;Lb6/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    return-object p1
.end method
