.class public final Lfa/c$a;
.super Lfa/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfa/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfa/c$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lfa/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lfa/c$a;-><init>()V

    return-void
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lfa/c$a$a;->j:Lfa/c$a$a;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 1

    invoke-static {}, Lfa/c;->a()Lfa/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfa/c;->b(I)I

    move-result p1

    return p1
.end method

.method public c()I
    .locals 1

    invoke-static {}, Lfa/c;->a()Lfa/c;

    move-result-object v0

    invoke-virtual {v0}, Lfa/c;->c()I

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 1

    invoke-static {}, Lfa/c;->a()Lfa/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfa/c;->d(I)I

    move-result p1

    return p1
.end method

.method public e(II)I
    .locals 1

    invoke-static {}, Lfa/c;->a()Lfa/c;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lfa/c;->e(II)I

    move-result p1

    return p1
.end method
