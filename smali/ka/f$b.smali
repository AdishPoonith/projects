.class final Lka/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka/f$b$a;
    }
.end annotation


# static fields
.field public static final l:Lka/f$b$a;


# instance fields
.field private final j:Ljava/lang/String;

.field private final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lka/f$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lka/f$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lka/f$b;->l:Lka/f$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "pattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/f$b;->j:Ljava/lang/String;

    iput p2, p0, Lka/f$b;->k:I

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lka/f;

    iget-object v1, p0, Lka/f$b;->j:Ljava/lang/String;

    iget v2, p0, Lka/f$b;->k:I

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(pattern, flags)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lka/f;-><init>(Ljava/util/regex/Pattern;)V

    return-object v0
.end method
