.class public final enum Ll9/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll9/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Ll9/i;

.field public static final enum l:Ll9/i;

.field public static final enum m:Ll9/i;

.field public static final enum n:Ll9/i;

.field private static final synthetic o:[Ll9/i;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Ll9/i;

    const-string v1, "HTTP_1_0"

    const/4 v2, 0x0

    const-string v3, "http/1.0"

    invoke-direct {v0, v1, v2, v3}, Ll9/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ll9/i;->k:Ll9/i;

    new-instance v1, Ll9/i;

    const-string v3, "HTTP_1_1"

    const/4 v4, 0x1

    const-string v5, "http/1.1"

    invoke-direct {v1, v3, v4, v5}, Ll9/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ll9/i;->l:Ll9/i;

    new-instance v3, Ll9/i;

    const-string v5, "SPDY_3"

    const/4 v6, 0x2

    const-string v7, "spdy/3.1"

    invoke-direct {v3, v5, v6, v7}, Ll9/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Ll9/i;->m:Ll9/i;

    new-instance v5, Ll9/i;

    const-string v7, "HTTP_2"

    const/4 v8, 0x3

    const-string v9, "h2"

    invoke-direct {v5, v7, v8, v9}, Ll9/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Ll9/i;->n:Ll9/i;

    const/4 v7, 0x4

    new-array v7, v7, [Ll9/i;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Ll9/i;->o:[Ll9/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ll9/i;->j:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Ll9/i;
    .locals 3

    sget-object v0, Ll9/i;->k:Ll9/i;

    iget-object v1, v0, Ll9/i;->j:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Ll9/i;->l:Ll9/i;

    iget-object v1, v0, Ll9/i;->j:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Ll9/i;->n:Ll9/i;

    iget-object v1, v0, Ll9/i;->j:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Ll9/i;->m:Ll9/i;

    iget-object v1, v0, Ll9/i;->j:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected protocol: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll9/i;
    .locals 1

    const-class v0, Ll9/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll9/i;

    return-object p0
.end method

.method public static values()[Ll9/i;
    .locals 1

    sget-object v0, Ll9/i;->o:[Ll9/i;

    invoke-virtual {v0}, [Ll9/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll9/i;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll9/i;->j:Ljava/lang/String;

    return-object v0
.end method
