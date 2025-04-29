.class Lk9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/p2;


# instance fields
.field private final a:Lokio/c;

.field private b:I

.field private c:I


# direct methods
.method constructor <init>(Lokio/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/o;->a:Lokio/c;

    iput p2, p0, Lk9/o;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b([BII)V
    .locals 1

    iget-object v0, p0, Lk9/o;->a:Lokio/c;

    invoke-virtual {v0, p1, p2, p3}, Lokio/c;->i0([BII)Lokio/c;

    iget p1, p0, Lk9/o;->b:I

    sub-int/2addr p1, p3

    iput p1, p0, Lk9/o;->b:I

    iget p1, p0, Lk9/o;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lk9/o;->c:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lk9/o;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lk9/o;->b:I

    return v0
.end method

.method public e(B)V
    .locals 1

    iget-object v0, p0, Lk9/o;->a:Lokio/c;

    invoke-virtual {v0, p1}, Lokio/c;->j0(I)Lokio/c;

    iget p1, p0, Lk9/o;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lk9/o;->b:I

    iget p1, p0, Lk9/o;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lk9/o;->c:I

    return-void
.end method

.method f()Lokio/c;
    .locals 1

    iget-object v0, p0, Lk9/o;->a:Lokio/c;

    return-object v0
.end method
