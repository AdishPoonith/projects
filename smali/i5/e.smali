.class public final Li5/e;
.super Li5/f;
.source "SourceFile"


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0, p1}, Li5/f;-><init>([B)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/nio/ByteBuffer;[B[B)[B
    .locals 0

    invoke-super {p0, p1, p2, p3}, Li5/f;->a(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/nio/ByteBuffer;[B[B[B)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Li5/f;->b(Ljava/nio/ByteBuffer;[B[B[B)V

    return-void
.end method

.method e([BI)Li5/d;
    .locals 1

    new-instance v0, Li5/c;

    invoke-direct {v0, p1, p2}, Li5/c;-><init>([BI)V

    return-object v0
.end method
