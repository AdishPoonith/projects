.class public final Lq0/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/d$b$a;
    }
.end annotation


# static fields
.field public static final n:Lq0/d$b$a;


# instance fields
.field private final j:Ljava/lang/String;

.field private final k:Z

.field private final l:Z

.field private final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq0/d$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq0/d$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lq0/d$b;->n:Lq0/d$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "jsonString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/d$b;->j:Ljava/lang/String;

    iput-boolean p2, p0, Lq0/d$b;->k:Z

    iput-boolean p3, p0, Lq0/d$b;->l:Z

    iput-object p4, p0, Lq0/d$b;->m:Ljava/lang/String;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 7

    new-instance v6, Lq0/d;

    iget-object v1, p0, Lq0/d$b;->j:Ljava/lang/String;

    iget-boolean v2, p0, Lq0/d$b;->k:Z

    iget-boolean v3, p0, Lq0/d$b;->l:Z

    iget-object v4, p0, Lq0/d$b;->m:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lq0/d;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/internal/g;)V

    return-object v6
.end method
