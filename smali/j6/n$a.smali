.class public final enum Lj6/n$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj6/n$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lj6/n$a;

.field public static final enum k:Lj6/n$a;

.field public static final enum l:Lj6/n$a;

.field public static final enum m:Lj6/n$a;

.field private static final synthetic n:[Lj6/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lj6/n$a;

    const-string v1, "REMOVED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj6/n$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj6/n$a;->j:Lj6/n$a;

    new-instance v1, Lj6/n$a;

    const-string v3, "ADDED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj6/n$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj6/n$a;->k:Lj6/n$a;

    new-instance v3, Lj6/n$a;

    const-string v5, "MODIFIED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lj6/n$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lj6/n$a;->l:Lj6/n$a;

    new-instance v5, Lj6/n$a;

    const-string v7, "METADATA"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lj6/n$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lj6/n$a;->m:Lj6/n$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lj6/n$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lj6/n$a;->n:[Lj6/n$a;

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

.method public static valueOf(Ljava/lang/String;)Lj6/n$a;
    .locals 1

    const-class v0, Lj6/n$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj6/n$a;

    return-object p0
.end method

.method public static values()[Lj6/n$a;
    .locals 1

    sget-object v0, Lj6/n$a;->n:[Lj6/n$a;

    invoke-virtual {v0}, [Lj6/n$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj6/n$a;

    return-object v0
.end method
