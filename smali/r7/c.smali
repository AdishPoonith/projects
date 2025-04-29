.class public final enum Lr7/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr7/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lr7/c;

.field public static final enum k:Lr7/c;

.field public static final enum l:Lr7/c;

.field public static final enum m:Lr7/c;

.field private static final synthetic n:[Lr7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lr7/c;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr7/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c;->j:Lr7/c;

    new-instance v1, Lr7/c;

    const-string v3, "TEXT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lr7/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lr7/c;->k:Lr7/c;

    new-instance v3, Lr7/c;

    const-string v5, "BYTE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lr7/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lr7/c;->l:Lr7/c;

    new-instance v5, Lr7/c;

    const-string v7, "NUMERIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lr7/c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lr7/c;->m:Lr7/c;

    const/4 v7, 0x4

    new-array v7, v7, [Lr7/c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lr7/c;->n:[Lr7/c;

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

.method public static valueOf(Ljava/lang/String;)Lr7/c;
    .locals 1

    const-class v0, Lr7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr7/c;

    return-object p0
.end method

.method public static values()[Lr7/c;
    .locals 1

    sget-object v0, Lr7/c;->n:[Lr7/c;

    invoke-virtual {v0}, [Lr7/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr7/c;

    return-object v0
.end method
