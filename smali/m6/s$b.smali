.class final enum Lm6/s$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm6/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm6/s$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lm6/s$b;

.field public static final enum k:Lm6/s$b;

.field public static final enum l:Lm6/s$b;

.field public static final enum m:Lm6/s$b;

.field private static final synthetic n:[Lm6/s$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lm6/s$b;

    const-string v1, "INVALID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm6/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm6/s$b;->j:Lm6/s$b;

    new-instance v1, Lm6/s$b;

    const-string v3, "FOUND_DOCUMENT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lm6/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lm6/s$b;->k:Lm6/s$b;

    new-instance v3, Lm6/s$b;

    const-string v5, "NO_DOCUMENT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lm6/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lm6/s$b;->l:Lm6/s$b;

    new-instance v5, Lm6/s$b;

    const-string v7, "UNKNOWN_DOCUMENT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lm6/s$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lm6/s$b;->m:Lm6/s$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lm6/s$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lm6/s$b;->n:[Lm6/s$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm6/s$b;
    .locals 1

    const-class v0, Lm6/s$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm6/s$b;

    return-object p0
.end method

.method public static values()[Lm6/s$b;
    .locals 1

    sget-object v0, Lm6/s$b;->n:[Lm6/s$b;

    invoke-virtual {v0}, [Lm6/s$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm6/s$b;

    return-object v0
.end method
