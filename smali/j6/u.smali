.class public final synthetic Lj6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/p0;

.field public final synthetic k:Li6/f;

.field public final synthetic l:Lcom/google/firebase/firestore/h0;


# direct methods
.method public synthetic constructor <init>(Lj6/p0;Li6/f;Lcom/google/firebase/firestore/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/u;->j:Lj6/p0;

    iput-object p2, p0, Lj6/u;->k:Li6/f;

    iput-object p3, p0, Lj6/u;->l:Lcom/google/firebase/firestore/h0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lj6/u;->j:Lj6/p0;

    iget-object v1, p0, Lj6/u;->k:Li6/f;

    iget-object v2, p0, Lj6/u;->l:Lcom/google/firebase/firestore/h0;

    invoke-static {v0, v1, v2}, Lj6/p0;->v(Lj6/p0;Li6/f;Lcom/google/firebase/firestore/h0;)V

    return-void
.end method
