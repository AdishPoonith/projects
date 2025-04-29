.class public Lj6/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/firestore/f0;


# instance fields
.field private final a:Lj6/p0;

.field private final b:Lj6/c1;

.field private final c:Lj6/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj6/h<",
            "Lj6/y1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj6/p0;Lj6/c1;Lj6/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj6/p0;",
            "Lj6/c1;",
            "Lj6/h<",
            "Lj6/y1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/w0;->a:Lj6/p0;

    iput-object p2, p0, Lj6/w0;->b:Lj6/c1;

    iput-object p3, p0, Lj6/w0;->c:Lj6/h;

    return-void
.end method


# virtual methods
.method public remove()V
    .locals 2

    iget-object v0, p0, Lj6/w0;->c:Lj6/h;

    invoke-virtual {v0}, Lj6/h;->d()V

    iget-object v0, p0, Lj6/w0;->a:Lj6/p0;

    iget-object v1, p0, Lj6/w0;->b:Lj6/c1;

    invoke-virtual {v0, v1}, Lj6/p0;->h0(Lj6/c1;)V

    return-void
.end method
