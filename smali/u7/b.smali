.class public final Lu7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[[B

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    aput p1, v0, v1

    const/4 v1, 0x0

    aput p2, v0, v1

    const-class v1, B

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Lu7/b;->a:[[B

    iput p1, p0, Lu7/b;->b:I

    iput p2, p0, Lu7/b;->c:I

    return-void
.end method


# virtual methods
.method public a(B)V
    .locals 4

    iget-object v0, p0, Lu7/b;->a:[[B

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-static {v3, p1}, Ljava/util/Arrays;->fill([BB)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(II)B
    .locals 1

    iget-object v0, p0, Lu7/b;->a:[[B

    aget-object p2, v0, p2

    aget-byte p1, p2, p1

    return p1
.end method

.method public c()[[B
    .locals 1

    iget-object v0, p0, Lu7/b;->a:[[B

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu7/b;->c:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lu7/b;->b:I

    return v0
.end method

.method public f(III)V
    .locals 1

    iget-object v0, p0, Lu7/b;->a:[[B

    aget-object p2, v0, p2

    int-to-byte p3, p3

    aput-byte p3, p2, p1

    return-void
.end method

.method public g(IIZ)V
    .locals 1

    iget-object v0, p0, Lu7/b;->a:[[B

    aget-object p2, v0, p2

    int-to-byte p3, p3

    aput-byte p3, p2, p1

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lu7/b;->b:I

    mul-int/lit8 v1, v1, 0x2

    iget v2, p0, Lu7/b;->c:I

    mul-int v1, v1, v2

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lu7/b;->c:I

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lu7/b;->a:[[B

    aget-object v3, v3, v2

    const/4 v4, 0x0

    :goto_1
    iget v5, p0, Lu7/b;->b:I

    if-ge v4, v5, :cond_2

    aget-byte v5, v3, v4

    if-eqz v5, :cond_1

    const/4 v6, 0x1

    if-eq v5, v6, :cond_0

    const-string v5, "  "

    goto :goto_2

    :cond_0
    const-string v5, " 1"

    goto :goto_2

    :cond_1
    const-string v5, " 0"

    :goto_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
