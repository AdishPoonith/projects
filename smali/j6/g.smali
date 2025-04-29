.class public final synthetic Lj6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lj6/h;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lcom/google/firebase/firestore/z;


# direct methods
.method public synthetic constructor <init>(Lj6/h;Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/g;->j:Lj6/h;

    iput-object p2, p0, Lj6/g;->k:Ljava/lang/Object;

    iput-object p3, p0, Lj6/g;->l:Lcom/google/firebase/firestore/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lj6/g;->j:Lj6/h;

    iget-object v1, p0, Lj6/g;->k:Ljava/lang/Object;

    iget-object v2, p0, Lj6/g;->l:Lcom/google/firebase/firestore/z;

    invoke-static {v0, v1, v2}, Lj6/h;->b(Lj6/h;Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V

    return-void
.end method
