.class Lcom/google/firebase/firestore/s$b;
.super Lcom/google/firebase/firestore/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/firebase/firestore/q;

.field private final b:Lj6/q$b;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/q;Lj6/q$b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/s;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/s$b;->a:Lcom/google/firebase/firestore/q;

    iput-object p2, p0, Lcom/google/firebase/firestore/s$b;->b:Lj6/q$b;

    iput-object p3, p0, Lcom/google/firebase/firestore/s$b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public m()Lcom/google/firebase/firestore/q;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/s$b;->a:Lcom/google/firebase/firestore/q;

    return-object v0
.end method

.method public n()Lj6/q$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/s$b;->b:Lj6/q$b;

    return-object v0
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/s$b;->c:Ljava/lang/Object;

    return-object v0
.end method
