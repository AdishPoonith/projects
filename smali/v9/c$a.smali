.class final Lv9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv9/c$a$a;
    }
.end annotation


# static fields
.field public static final k:Lv9/c$a$a;


# instance fields
.field private final j:[Lv9/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv9/c$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv9/c$a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lv9/c$a;->k:Lv9/c$a$a;

    return-void
.end method

.method public constructor <init>([Lv9/g;)V
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv9/c$a;->j:[Lv9/g;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lv9/c$a;->j:[Lv9/g;

    sget-object v1, Lv9/h;->j:Lv9/h;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v1, v4}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
