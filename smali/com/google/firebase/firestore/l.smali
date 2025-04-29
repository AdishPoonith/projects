.class public final synthetic Lcom/google/firebase/firestore/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/firestore/o;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/m;

.field public final synthetic b:Lcom/google/firebase/firestore/o;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/m;Lcom/google/firebase/firestore/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/l;->a:Lcom/google/firebase/firestore/m;

    iput-object p2, p0, Lcom/google/firebase/firestore/l;->b:Lcom/google/firebase/firestore/o;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/z;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/l;->a:Lcom/google/firebase/firestore/m;

    iget-object v1, p0, Lcom/google/firebase/firestore/l;->b:Lcom/google/firebase/firestore/o;

    check-cast p1, Lj6/y1;

    invoke-static {v0, v1, p1, p2}, Lcom/google/firebase/firestore/m;->a(Lcom/google/firebase/firestore/m;Lcom/google/firebase/firestore/o;Lj6/y1;Lcom/google/firebase/firestore/z;)V

    return-void
.end method
