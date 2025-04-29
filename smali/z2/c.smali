.class public final Lz2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;


# instance fields
.field private final a:Lo3/l$a;


# direct methods
.method public constructor <init>(Lo3/l$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/c;->a:Lo3/l$a;

    return-void
.end method


# virtual methods
.method public a(I)Lo3/l;
    .locals 0

    iget-object p1, p0, Lz2/c;->a:Lo3/l$a;

    invoke-interface {p1}, Lo3/l$a;->a()Lo3/l;

    move-result-object p1

    return-object p1
.end method
